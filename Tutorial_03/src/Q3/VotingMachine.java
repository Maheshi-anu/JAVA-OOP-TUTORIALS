package Q3;

public class VotingMachine {
    private int labourVote;
    private int conservationVote;



    public  void clearTheMachineState(){
        labourVote = 0;
        conservationVote = 0;
    }

    public  void voteForALabour(){
        labourVote += 1;

    }

    public  void voteForAConservative(){
        conservationVote += (int) (Math.random()*(2000));

    }

    public  int getLabourVote(){
        return labourVote;
    }

    public  int getConservationVote(){
        return conservationVote;
    }


}
