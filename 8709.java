      private VoteRunnableHolder(QuorumVote quorumVote, List<VoteRunnable> runnables, int size) {
         this.quorumVote = quorumVote;

         this.runnables = runnables;
         this.size = size;
      }