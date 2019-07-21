package com.capgemini.app2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {

	private String questionId;
	private String question;
	private List<Answer> answer;

	private List<Answer> answers1;
//	private Set<Answer> answers2;
//	private Map<Integer, Answer> answers3;

	public String getQuestionId() {
		return questionId;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}


	public List<Answer> getAnswers1() {
		return answers1;
	}

	public void setAnswers1(List<Answer> answers1) {
		this.answers1 = answers1;
	}

	/*public Set<Answer> getAnswers2() {
		return answers2;
	}

	public void setAnswers2(Set<Answer> answers2) {
		this.answers2 = answers2;
	}
*/
/*	public Map<Integer, Answer> getAnswers3() {
		return answers3;
	}

	public void setAnswers3(Map<Integer, Answer> answers3) {
		this.answers3 = answers3;
	}*/
	
	public void printQuestion()
	{
		
		System.out.println("Question:- "+getQuestion());
	}

	public void printAnswers()
	{
	 for(Answer answer : answer)
	 {
		 System.out.println(answer.getAnswers());
	 }
	}

	public List<Answer> getAnswer() {
		return answer;
	}
}
