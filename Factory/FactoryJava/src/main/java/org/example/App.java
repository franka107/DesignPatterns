package org.example;

import org.example.factory.Dialog;
import org.example.factory.HtmlDialog;
import org.example.factory.WindowsDialog;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Dialog dialog;

    public static void main( String[] args )
    {
        configure();
        runBusinessLogic();

    }

    static void configure(){
        if(System.getProperty("os.name").equals("Windows 10")){
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic(){
        dialog.renderWindow();
    }
}
