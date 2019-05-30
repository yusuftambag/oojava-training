package yte.summerp.oopjava.service;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class ServiceRunner {
	private List<Issue> issueList = new ArrayList<Issue>();
	private ServiceLoader<IssueTypeExportImportService> issueTypeExportImportServiceLoader;

	public ServiceRunner() {
		issueTypeExportImportServiceLoader = ServiceLoader.load(IssueTypeExportImportService.class);
	}

	public static void main(String argv[]) {
		// TODO: Implement here to read and then write the issues using the issue list provided
	}
}
