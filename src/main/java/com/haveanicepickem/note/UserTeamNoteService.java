package com.haveanicepickem.note;

public class UserTeamNoteService {

    private UserTeamNoteRepository userTeamNoteRepository;
    private UserTeamNoteMapper userTeamNoteMapper;
    private String teamID;
    private Long userID;

    public UserTeamNoteService(Long userID, String teamID) {
        this.userID = userID;
        this.teamID = teamID;
    }

    public UserTeamNoteDTO getTeamNotes() {
        UserTeamNoteId userTeamNoteIdentifier = new UserTeamNoteId(userID, teamID);
        return userTeamNoteRepository.findById(userTeamNoteIdentifier)
                                        .map(userTeamNoteMapper::toDTO)
                                        .orElse(null);
    }

}
