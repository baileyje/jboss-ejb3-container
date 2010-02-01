/*
* JBoss, Home of Professional Open Source
* Copyright 2005, JBoss Inc., and individual contributors as indicated
* by the @authors tag. See the copyright.txt in the distribution for a
* full listing of individual contributors.
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
package org.jboss.ejb3.container.spi;

/**
 * StatelessEJBInstanceManager
 * <p>
 *  A {@link StatelessEJBInstanceManager} is responsible for creating/destroying 
 *  stateless bean instances.
 * </p>
 * @author Jaikiran Pai
 * @version $Revision: $
 */
public interface StatelessEJBInstanceManager extends EJBInstanceManager
{
   /**
    * @return Returns a {@link BeanContext} for a stateless session bean.
    * It's upto the underlying implementation to either create a new bean
    * instance and return the {@link BeanContext} or return an existing
    * bean instance from a pool 
    * 
    */
   BeanContext get();

}
