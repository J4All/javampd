package org.bff.javampd.server;

/**
 * The listener interface for receiving MPD error events. The class
 * that is interested in processing a error event implements this interface,
 * and the object created with that class is registered with a component
 * using the component's <CODE>addMPDErrorListener</CODE> method. When the
 * error event occurs, that object's <CODE> errorEventReceived</CODE>
 * method is invoked.
 *
 * @author Bill
 * @version 1.0
 */
public interface MPDErrorListener {

    /**
     * Invoked when a MPD error occurs.
     *
     * @param event the event received
     */
    public void errorEventReceived(MPDErrorEvent event);

}
