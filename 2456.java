    @Override public RelOptCost computeSelfCost(RelOptPlanner planner,
        RelMetadataQuery mq) {
      return super.computeSelfCost(planner, mq)
          .multiplyBy(JdbcConvention.COST_MULTIPLIER);
    }