package Q3;

public class VotingTester {
    public static void main(String[] args) {
        VotingMachine votingMachine = new VotingMachine();
        votingMachine.clearTheMachineState();
        votingMachine.voteForALabour();
        votingMachine.voteForAConservative();

        System.out.println("Labour Vote: " + votingMachine.getLabourVote());
        System.out.println("Conservation Vote: " + votingMachine.getConservationVote());


    }
}
