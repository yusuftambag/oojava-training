package yte.summerp.oopjava.service;

public interface Issue {
	public void setIssueKey(String issueKey);

	public void setIssueType(IssueType issueType);

	public void setAssignee(String assignee);

	public void setSummary(String summary);

	public String getIssueKey();

	public IssueType getIssueType();

	public String getAssignee();

	public String getSummary();

	public void setCustomFieldValue(String fieldName,Object value);

	public Object getCustomFieldValue(String fieldName);
}
