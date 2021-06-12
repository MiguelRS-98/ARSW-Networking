package edu.escuelaing.arws.TrigonometricCalculator;

import java.io.*;
import java.net.*;

/**
 * This class is a trigonometric calculator server with functions of sin, cos and tan.
 * @author Miguel Angel Rodriguez Siachoque
 * @author Luis Daniel Benavides Navarro
 */
public class EchoServerTrigonometric
{    
    private static String funtion = "cos";
    /**
     * Main method that gets input from client and prints results and function changes.
     * @param args input from client.
     * @throws IOException Exception in the case of not finding the port.
     */
    public static void main(String[] args) throws Exception 
    {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(35000);
        } catch (IOException e) {
            System.err.println("Could not listen on port: 35000.");
            System.exit(1);
        }
        Socket clientSocket = null;
        try {
            System.out.println("Listo para recibir en puerto: 35000.");
            clientSocket = serverSocket.accept();
        } catch (IOException e) {
            System.err.println("Accept failed.");
            System.exit(1);
        }
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader (new InputStreamReader(clientSocket.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) !=null) {
            System.out.println("Mensaje recibido:" + inputLine);
            out.println(isBye(inputLine));
            if (isBye(inputLine).equals("Respuesta de servidor: Bye.")) {
                break;
            }
        }
        System.out.println("Cerrando el servidor...");
        out.close();
        in.close();
        clientSocket.close();
        serverSocket.close();
    }
    /**
     * This method is to confirm if the client wants to shut down the server or not.
     * @param inputLine input from client.
     * @return Server response.
     */
    public static String isBye (String inputLine) 
    {
        if (inputLine.equals("Bye.")) {
            return "Respuesta de servidor: " + inputLine;
        }
        else {
            return changeFuntion(inputLine);
        }
    }
    /**
     * This method is in charge of doing the calculations and changing the function if necessary.
     * @param inputLine input from client.
     * @return calculation of the set function.
     */
    public static String changeFuntion (String inputLine) 
    {
        double input;
        String outputLine = "";
        if (!inputLine.contains("fun:")) {
            input = Double.parseDouble(inputLine);
            switch (funtion) {
                case "sin":
                    outputLine = "Sin " + input + ":" + Math.sin(Math.toRadians(input)) + ".";
                    break;
                case "cos":
                    outputLine = "Cos " + input + ":" + Math.cos(Math.toRadians(input)) + ".";
                    break;
                case "tan":
                    outputLine = "Tan " + input + ":" + Math.tan(Math.toRadians(input)) + ".";
                    break;
                default:
                    break;
            }
        }
        else if (inputLine.contains("fun:")) {
            String [] newFuntion = inputLine.split(":");
            outputLine = "Funtion Changed " + funtion + " to " + newFuntion[1] + ".";
            funtion = newFuntion[1];
        }
        return outputLine;
    }
}