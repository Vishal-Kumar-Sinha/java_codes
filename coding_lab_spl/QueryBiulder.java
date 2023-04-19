//package com.google.jdbc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class QueryBiulder {

	public static String getCreateQuery() {
		ArrayList<String> primaryList = new ArrayList<>();//null;
		ArrayList<String> columnNames = new ArrayList<>();//null;
		Iterator<String> primaryKeyIterator = null;
		String tname;// = null;
		String query = null;
		Scanner sc = new Scanner(System.in);//null;
		try {
			//sc = new Scanner(System.in);
			System.out.print("Enter the table name  :: ");
			tname = sc.next().toUpperCase();
			System.out.println();
			query = "CREATE TABLE " + tname + "(";
			int primaryKeyCount = 0;
			String keyCol = "";

			//primaryList = new ArrayList<>();
			//columnNames = new ArrayList<>();
			

			while (true) {
				System.out.print("Enter Coloumn name  :: ");
				String colName = sc.next().toUpperCase();
				if (columnNames.contains(colName)) {
					System.out.println("Column already exists . plz rerun the query");
					System.exit(0);
				} else {
					columnNames.add(colName);
					System.out.print("Enter column type and size \"Format type(size)\"  :: ");
					String colTypeSize = sc.next().toUpperCase();

					System.out.print("Is it primary key ? say yes or no  :: ");
					String primaryKeyOption = sc.next();

					if (primaryKeyOption.equalsIgnoreCase("Yes")) {
						if (primaryList.contains(colName)) {
							System.out.println("Column name exists");
						} else {
							primaryList.add(colName);
							keyCol = keyCol + "," + colName;
							primaryKeyCount++;
						}

					}

					query = query + colName + " " + colTypeSize;
					System.out.print("More coloums?  say yes or no  :: ");
					String columnOption = sc.next();
					if (columnOption.equalsIgnoreCase("yes")) {
						query = query + ",";
						continue;
					} else {
						if (primaryKeyCount != 0) {
							query = query + ", PRIMARY KEY (";
							if (primaryKeyCount == 1) {
								query = query + primaryList.get(0) + "))";
							} else {
								primaryKeyIterator = primaryList.listIterator(1);
								query = query + primaryList.get(0);
								while (primaryKeyIterator.hasNext()) {
									query = "," + primaryKeyIterator.next();

								}
								query += "))";
							}
						} else {
							query = query + ")";
						}
						break;
					}

				}
			}

		} catch (

		Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (sc != null)
					sc.close();
				primaryList.clear();
				columnNames.clear();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return query;
	}

}
