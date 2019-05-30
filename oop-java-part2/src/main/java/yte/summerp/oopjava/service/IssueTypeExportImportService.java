package yte.summerp.oopjava.service;

import java.io.OutputStreamWriter;
import java.util.List;

public interface IssueTypeExportImportService {
	public <T extends Issue> List<T> importIssues();

	public <T extends  Issue> void exportIssues(List<T> issueList, OutputStreamWriter writer);

	public boolean handlesIssueType(IssueType issueType);
}
