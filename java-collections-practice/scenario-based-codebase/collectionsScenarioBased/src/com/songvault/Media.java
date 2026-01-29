package com.songvault;

//Generic media base class
public class Media<T> {

 private T mediaType; // Audio, Video, Podcast

 public Media(T mediaType) {
     this.mediaType = mediaType;
 }

 public T getMediaType() {
     return mediaType;
 }
}
