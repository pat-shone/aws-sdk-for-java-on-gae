/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

/**
 * Replace Network Acl Association Result
 */
public class ReplaceNetworkAclAssociationResult {

    private String newAssociationId;

    /**
     * Returns the value of the NewAssociationId property for this object.
     *
     * @return The value of the NewAssociationId property for this object.
     */
    public String getNewAssociationId() {
        return newAssociationId;
    }
    
    /**
     * Sets the value of the NewAssociationId property for this object.
     *
     * @param newAssociationId The new value for the NewAssociationId property for this object.
     */
    public void setNewAssociationId(String newAssociationId) {
        this.newAssociationId = newAssociationId;
    }
    
    /**
     * Sets the value of the NewAssociationId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param newAssociationId The new value for the NewAssociationId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ReplaceNetworkAclAssociationResult withNewAssociationId(String newAssociationId) {
        this.newAssociationId = newAssociationId;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("NewAssociationId: " + newAssociationId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    