  @Private
  @Unstable
  public static GetQueueInfoResponse newInstance(QueueInfo queueInfo) {
    GetQueueInfoResponse response = Records.newRecord(GetQueueInfoResponse.class);
    response.setQueueInfo(queueInfo);
    return response;
  }