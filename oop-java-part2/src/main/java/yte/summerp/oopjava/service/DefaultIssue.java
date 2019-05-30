package yte.summerp.oopjava.service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class DefaultIssue implements Issue {
	private String issueKey;
	private IssueType issueType;
	private String assignee;
	private String summary;

	@Override
	public void setIssueKey(String issueKey) {
		this.issueKey = issueKey;
	}

	@Override
	public void setIssueType(IssueType issueType) {
		this.issueType = issueType;
	}

	@Override
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	@Override
	public void setSummary(String summary) {
		this.summary = summary;
	}

	@Override
	public String getIssueKey() {
		return issueKey;
	}

	@Override
	public IssueType getIssueType() {
		return issueType;
	}

	@Override
	public String getAssignee() {
		return assignee;
	}

	@Override
	public String getSummary() {
		return summary;
	}

	private Method findMethodByName(String methodName) {
		Method[] methods=getClass().getMethods();
		if(methods!=null) {
			for(Method m:methods) {
				if(m.getName().equals(methodName))
					return m;
			}
		}
		return null;
	}

	@Override
	public void setCustomFieldValue(String fieldName, Object value) {
		if(fieldName!=null) {
			String methodName="set"+Character.toUpperCase(fieldName.charAt(0))+fieldName.substring(1);
			Method m =findMethodByName(methodName);
			if(m!=null) {
				try {
					m.invoke(this,value);
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public Object getCustomFieldValue(String fieldName) {
		if(fieldName!=null) {
			String methodName="get"+Character.toUpperCase(fieldName.charAt(0))+fieldName.substring(1);
			Method m =findMethodByName(methodName);
			if(m!=null) {
				try {
					return m.invoke(this);
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}
}
