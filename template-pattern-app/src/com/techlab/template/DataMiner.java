package com.techlab.template;

public abstract class DataMiner {
	public void mineData(String filepath) {
		loadFile(filepath);
		readFile(filepath);
		cleanData(filepath);
		analyzeData();
		generatingReport();
	}
	abstract protected void loadFile(String filepath);
	abstract protected void readFile(String filepath);
	abstract protected void cleanData(String filedata);
	private void analyzeData() {
		System.out.println("analyzing data");
	}
	private void generatingReport() {
		System.out.println("generating report");
	}
	

}
