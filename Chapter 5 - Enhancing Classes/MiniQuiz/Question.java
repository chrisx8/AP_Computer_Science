/*
The 'Question' class provides an implementation of Complexity_Interface, and defines a 'Question' class for running
the MiniQuiz.
This is a demonstration on how to implement an interface when creating a class
 */

package MiniQuiz;

public class Question implements Complexity_Interface {
    
    private String question, answer;
    private int complexityLevel;
    
    public Question(String query, String result)
    {
        question = query;
        answer = result;
        complexityLevel = 1;
    }
    
    public void setComplexity(int level)
    {
        complexityLevel = level;
    }
    
    public int getComplexity()
    {
        return complexityLevel;
    }
    
    public String getQuestion()
    {
        return question;
    }
    
    public String getAnswer()
    {
        return answer;
    }
    
    public boolean answerCorrect(String candidateAnswer)
    {
        return answer.equals(candidateAnswer);
    }
    
    public String toString()
    {
        return question + "\n" + answer;
    }
}
