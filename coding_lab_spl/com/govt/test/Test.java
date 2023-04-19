package com.govt.test;
import com.govt.*;
import com.govt.cs.*;
import com.govt.ms.*;

public class Test {

	public static void main(String[] args) {
		Government j1=new CivilServices();
		j1.jobs();
		Government j2=new MilitaryServices();
		j2.jobs();
	}

}
