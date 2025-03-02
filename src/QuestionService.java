import java.util.Scanner;

public class QuestionService {

    Questions[] questions = new Questions[5];
    String[] selection = new String[5];

    public QuestionService() {
        questions[0]=new Questions(1,"Which one is the fastest programming language","Java","python","js","go","java");
        questions[1]=new Questions(1,"Which one is the fastest programming language","Java","python","js","go","java");
        questions[2]=new Questions(1,"Which one is the fastest programming language","Java","python","js","go","java");
        questions[3]=new Questions(1,"Which one is the fastest programming language","Java","python","js","go","java");
        questions[4]=new Questions(1,"Which one is the fastest programming language","Java","python","js","go","java");

    }

    public void displayQuestions() {
       int i=0;
       for(Questions q:questions) {
           System.out.println("Questions no: " + q.getId());
           System.out.println(q.getQuestionContext());
           System.out.println(q.getOption1());
           System.out.println(q.getOption2());
           System.out.println(q.getOption3());
           System.out.println(q.getOption4());
           Scanner sc = new Scanner(System.in);
           selection[i++]=sc.nextLine();
       }

       for (String s:selection) {
           System.out.println(s);
       }
    }
}
