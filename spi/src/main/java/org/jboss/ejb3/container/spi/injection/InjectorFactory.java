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
package org.jboss.ejb3.container.spi.injection;

import java.lang.reflect.Method;
import java.util.List;

import org.jboss.metadata.ejb.jboss.JBossEnterpriseBeanMetaData;

/**
 * InjectorFactory
 *
 * @author Jaikiran Pai
 * @version $Revision: $
 */
public interface InjectorFactory
{
   public List<EJBContainerENCInjector> createENCInjectors(JBossEnterpriseBeanMetaData enterpriseBeanMetaData);
   
   public EJBContainerENCInjector createENCInjector(Method method);
   
   // TODO: This applies only when there is a "injection-target" element specified in the metadata
   //public List<InstanceInjector> createBeanInstanceInjectors(JBossEnterpriseBeanMetaData enterpriseBeanMetaData);
   
   public InstanceInjector createInstanceInjector(Method method);

  // more methods for field and class injection to be added later 
}