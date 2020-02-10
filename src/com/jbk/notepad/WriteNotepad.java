package com.jbk.notepad;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class WriteNotepad {
	public static void main(String[] args) throws Exception {
		String s="ashish";
		FileOutputStream fout=new FileOutputStream("Write.txt");
		fout.write(s.getBytes());
		System.out.println("hello");
		
	}

}
