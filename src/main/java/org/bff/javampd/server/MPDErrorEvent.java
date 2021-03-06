package org.bff.javampd.server;

/**
 * An event used to identify a MPD error.
 *
 * @author Bill
 * @version 1.0
 */
public class MPDErrorEvent extends java.util.EventObject {
    private String msg;

    /**
     * Creates a new instance of MPDErrorEvent
     *
     * @param source the object on which the Event initially occurred
     */
    public MPDErrorEvent(Object source) {
        super(source);
    }

    /**
     * Creates a new instance of MPDErrorEvent
     *
     * @param msg    an optional message
     * @param source the object on which the Event initially occurred
     */
    public MPDErrorEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    /**
     * Returns the message attached to this event.  If there is no message null
     * is returned.
     *
     * @return the optional message
     */
    public String getMsg() {
        return msg;
    }
}
