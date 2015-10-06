package com.niennonno.chatbox;

/**
 * Created by Aditya Vikram on 10/5/2015.
 */
public class Message {
    private String mText;
    private String mSender;

    Message(String text, String sender) {
        mText = text;
        mSender = sender;
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public String getmSender() {
        return mSender;
    }

    public void setmSender(String mSender) {
        this.mSender = mSender;
    }
}
