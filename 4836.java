    @Override
    public Mono<ListMembersResponse> listMembers(ListMembersRequest request) {
        return get(request, ListMembersResponse.class, builder -> builder.pathSegment("Groups", request.getGroupId(), "members"))
            .checkpoint();
    }