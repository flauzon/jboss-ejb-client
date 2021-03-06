/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2012, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.ejb.client;

/**
 * An {@link EJBClientContextListener} can be {@link EJBClientContext#registerEJBClientContextListener(EJBClientContextListener) registered to an EJBClientContext}
 * to listen to the lifecycle events of the context
 *
 * @author Jaikiran Pai
 */
public interface EJBClientContextListener {

    /**
     * This method will be invoked when the {@link EJBClientContext} to which this
     * listener is registered is {@link org.jboss.ejb.client.EJBClientContext#close() closed}
     *
     * @param ejbClientContext The EJB client context which was closed
     */
    void contextClosed(EJBClientContext ejbClientContext);

    /**
     * This method will be invoked when a {@link EJBReceiver} is registered to a {@link EJBClientContext}
     *
     * @param receiverContext The {@link EJBReceiverContext} which was associated to the {@link EJBClientContext} when the {@link EJBReceiver}
     *                        was registered with the context
     */
    void receiverRegistered(final EJBReceiverContext receiverContext);

    /**
     * This method will be invoked when a {@link EJBReceiver} is unregistered from a {@link EJBClientContext}
     *
     * @param receiverContext The {@link EJBReceiverContext} which was disassociated from the {@link EJBClientContext}
     *                        when the {@link EJBReceiver} was unregistered from the context
     */
    void receiverUnRegistered(final EJBReceiverContext receiverContext);
}
