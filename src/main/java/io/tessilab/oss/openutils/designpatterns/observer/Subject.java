/*
 * Copyright 2017 Tessi lab.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.tessilab.oss.openutils.designpatterns.observer;

/**
 * Te interface to represent the subject of the observer design pattern.
 * @author Andres BEL ALONSO
 */
public interface Subject {
    
    /**
     * Notifies to all the observers than a changement has overcome. 
     * That observers will come to the subject to take the information that 
     * concernes them
     */
    
    public void notifyObservers();
    
    /**
     * Attach the observer passed in argument to this subject
     * @param observer 
     */
    public void attach(Observer observer);
    
    /**
     * Removes the observer passed in argument to this method from this observer
     * @param observer 
     */
    public void removeObserver(Observer observer);
    
    
}
