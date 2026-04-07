package com.haveanicepickem.note;

public class UserTeamNoteMapper {

    public UserTeamNoteDTO toDTO(UserTeamNoteEntity userTeamNote) {
        byte[] note = userTeamNote.getNotes();

        return new UserTeamNoteDTO(note);
    }

}
