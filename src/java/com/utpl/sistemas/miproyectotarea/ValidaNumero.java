/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utpl.sistemas.miproyectotarea;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author czambranoc
 */
@WebServlet(urlPatterns = {"/ValidaNumero"})
//@WebServlet(name = "ValidaNumero")
public class ValidaNumero extends HttpServlet {

    public String numero_in;
    public String tipnumero;
    public String json;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        numero_in = request.getParameter("numero");
        tipnumero = numero_in.substring(0, 2);
        int log_numero = numero_in.length();

        String ZCTRN = "02";
        String ZCTRS = "03";
        String ZOESUR = "04";
        String ZOECTR = "05";
        String ZNOR = "06";
        String ZSUR = "07";

        if ((numero_in.length() < 7 && numero_in.length() > 0) || (numero_in.length() > 13)) {

            PrintWriter writer = response.getWriter();

            // HTML codigo
            String htmlRespone = "<html>";
            htmlRespone += "<h2>NÚMERO INVÁLIDO" + "<br/>";
            json = "NÚMERO INVÁLIDO";
            System.out.println(json);
            htmlRespone += "</html>";
            // respuesta
            writer.println(htmlRespone);

        } else if (tipnumero.equals("09") || tipnumero.equals("+5") || tipnumero.equals("59")) {

            json = "\n"
                    + "{\n"
                    + "\n'País': 'Ecuador',"
                    + "\n'Número de dígitos': " + log_numero + " 'números',"
                    + "\n'Tipo - Móvil':  '" + numero_in + "'}";

            System.out.println(json);

            PrintWriter writer = response.getWriter();

            // HTML codigo
            String htmlRespone = "<html>";
            htmlRespone += "<h2>Su número es: " + numero_in + "<br/>";
            htmlRespone += json + "</h2>";
            htmlRespone += "</html>";

            // respuesta
            writer.println(htmlRespone);

        } else {

            System.out.println("Tipo - Fijo " + numero_in);

            if (numero_in.length() < 8) {

                json = "\n"
                        + "{\n"
                        + "\n'País': 'Ecuador',"
                        + "\n'Número de dígitos': " + log_numero + " 'números',"
                        + "\n'Tipo - Local':  '" + numero_in + "'}";

                System.out.println(json);

                PrintWriter writer = response.getWriter();

                // HTML codigo
                String htmlRespone = "<html>";
                htmlRespone += "<h2>Su número es: " + numero_in + "<br/>";
                htmlRespone += json + "</h2>";
                htmlRespone += "</html>";

                // respuesta
                writer.println(htmlRespone);

            } else if (numero_in.length() == 9) {

                if (tipnumero.equals(ZCTRN)) {

                    json = "\n"
                            + "{\n"
                            + "\n'País': 'Ecuador',"
                            + "\n'Número de dígitos': " + log_numero + " 'números',"
                            + "\n'Zona Centro Norte: Pichincha, Santo Domingo',"
                            + "\n'Tipo - Provincial':  '" + numero_in + "'}";

                    System.out.println(json);

                    PrintWriter writer = response.getWriter();

                    // HTML codigo
                    String htmlRespone = "<html>";
                    htmlRespone += "<h2>Su número es: " + numero_in + "<br/>";
                    htmlRespone += json + "</h2>";
                    htmlRespone += "</html>";

                    // respuesta
                    writer.println(htmlRespone);

                }
                if (tipnumero.equals(ZCTRS)) {

                    json = "\n"
                            + "{\n"
                            + "\n'País': 'Ecuador',"
                            + "\n'Número de dígitos': " + log_numero + " 'números',"
                            + "\n'Zona Centro Sur: Cotopaxi, Tungurahua, Bolívar, Chimborazo',"
                            + "\n'Tipo - Provincial':  '" + numero_in + "'}";

                    System.out.println(json);

                    PrintWriter writer = response.getWriter();

                    // HTML codigo
                    String htmlRespone = "<html>";
                    htmlRespone += "<h2>Su número es: " + numero_in + "<br/>";
                    htmlRespone += json + "</h2>";
                    htmlRespone += "</html>";

                    // respuesta
                    writer.println(htmlRespone);

                }
                if (tipnumero.equals(ZOESUR)) {

                    json = "\n"
                            + "{\n"
                            + "\n'País': 'Ecuador',"
                            + "\n'Número de dígitos': " + log_numero + " 'números',"
                            + "\n'Zona Sur Oeste: Guayas, Santa Elena',"
                            + "\n'Tipo - Provincial':  '" + numero_in + "'}";

                    System.out.println(json);

                    PrintWriter writer = response.getWriter();

                    // HTML codigo
                    String htmlRespone = "<html>";
                    htmlRespone += "<h2>Su número es: " + numero_in + "<br/>";
                    htmlRespone += json + "</h2>";
                    htmlRespone += "</html>";

                    // respuesta
                    writer.println(htmlRespone);

                }
                if (tipnumero.equals(ZOECTR)) {

                    json = "\n"
                            + "{\n"
                            + "\n'País': 'Ecuador',"
                            + "\n'Número de dígitos': " + log_numero + " 'números',"
                            + "\n'Zona Sur Oeste Central: Manabí, Los Ríos',"
                            + "\n'Tipo - Provincial':  '" + numero_in + "'}";

                    System.out.println(json);

                    PrintWriter writer = response.getWriter();

                    // HTML codigo
                    String htmlRespone = "<html>";
                    htmlRespone += "<h2>Su número es: " + numero_in + "<br/>";
                    htmlRespone += json + "</h2>";
                    htmlRespone += "</html>";

                    // respuesta
                    writer.println(htmlRespone);

                }
                if (tipnumero.equals(ZSUR)) {

                    json = "\n"
                            + "{\n"
                            + "\n'País': 'Ecuador',"
                            + "\n'Número de dígitos': " + log_numero + " 'números',"
                            + "\n'Zona Sur: Azuay, Cañar, El Oro, Loja, Morona Santiago, Zamora Chinchipe',"
                            + "\n'Tipo - Provincial':  '" + numero_in + "'}";

                    System.out.println(json);

                    PrintWriter writer = response.getWriter();

                    // HTML codigo
                    String htmlRespone = "<html>";
                    htmlRespone += "<h2>Su número es: " + numero_in + "<br/>";
                    htmlRespone += json + "</h2>";
                    htmlRespone += "</html>";

                    // respuesta
                    writer.println(htmlRespone);
                }
                if (tipnumero.equals(ZNOR)) {

                    json = "\n"
                            + "{\n"
                            + "\n'País': 'Ecuador',"
                            + "\n'Número de dígitos': " + log_numero + " 'números',"
                            + "\n'Zona Norte: Carchi, Esmeraldas, Imbabura, Napo, Orellana, Sucumbios',"
                            + "\n'Tipo - Provincial':  '" + numero_in + "'}";

                    System.out.println(json);

                    PrintWriter writer = response.getWriter();

                    // HTML codigo
                    String htmlRespone = "<html>";
                    htmlRespone += "<h2>Su número es: " + numero_in + "<br/>";
                    htmlRespone += json + "</h2>";
                    htmlRespone += "</html>";

                    // respuesta
                    writer.println(htmlRespone);
                }
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
