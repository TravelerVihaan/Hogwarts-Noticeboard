package com.github.travelervihaan.hogwarts.noticeboard.announcements;

import java.time.LocalDateTime;
import java.util.Objects;

public class Announcement {

    private final LocalDateTime dateAdded;
    private final LocalDateTime lastEdit;
    private final String title;
    private final String text;

    private final long authorId;

    public Announcement(LocalDateTime dateAdded, LocalDateTime lastEdit, String title, String text, long authorId) {
        this.dateAdded = dateAdded;
        this.lastEdit = lastEdit;
        this.title = title;
        this.text = text;
        this.authorId = authorId;
    }

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }

    public LocalDateTime getLastEdit() {
        return lastEdit;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public long getAuthorId() {
        return authorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Announcement that = (Announcement) o;
        return authorId == that.authorId && Objects.equals(dateAdded, that.dateAdded) && Objects.equals(lastEdit, that.lastEdit) && Objects.equals(title, that.title) && Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateAdded, lastEdit, title, text, authorId);
    }

    @Override
    public String toString() {
        return "Annoucement{" +
                "dateAdded=" + dateAdded +
                ", lastEdit=" + lastEdit +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", authorId=" + authorId +
                '}';
    }
}
