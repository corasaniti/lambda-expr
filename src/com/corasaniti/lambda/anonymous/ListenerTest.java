package com.corasaniti.lambda.anonymous;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ListenerTest {
	 
	   public static void main(String[] args) {
	 
	   // Anonymous ActionListener
	   JButton testButton = new JButton("Test Button");
	   
	   // Anonymous Class
	   testButton.addActionListener(new ActionListener(){
	    @Override public void actionPerformed(ActionEvent ae){
	        System.out.println("Click Detected by Anon Class");
	      }
	    });
	 
	    // Lambda ActionListener
	    testButton.addActionListener(e -> System.out.println("Click Detected by Lambda Listner"));
	  }
	 }