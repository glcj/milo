/*
 * Copyright (c) 2016 Kevin Herron
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 *
 * The Eclipse Public License is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 *   http://www.eclipse.org/org/documents/edl-v10.html.
 */

package org.eclipse.milo.opcua.sdk.server.model.types.variables;

import org.eclipse.milo.opcua.sdk.core.model.BasicProperty;
import org.eclipse.milo.opcua.sdk.core.model.Property;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.QualifiedName;
import org.eclipse.milo.opcua.stack.core.types.structured.EUInformation;
import org.eclipse.milo.opcua.stack.core.types.structured.Range;


public interface AnalogItemType extends DataItemType {

    Property<Range> INSTRUMENT_RANGE = new BasicProperty<>(
        QualifiedName.parse("0:InstrumentRange"),
        NodeId.parse("ns=0;i=884"),
        -1,
        Range.class
    );

    Property<Range> E_U_RANGE = new BasicProperty<>(
        QualifiedName.parse("0:EURange"),
        NodeId.parse("ns=0;i=884"),
        -1,
        Range.class
    );

    Property<EUInformation> ENGINEERING_UNITS = new BasicProperty<>(
        QualifiedName.parse("0:EngineeringUnits"),
        NodeId.parse("ns=0;i=887"),
        -1,
        EUInformation.class
    );


    Range getInstrumentRange();

    PropertyType getInstrumentRangeNode();

    void setInstrumentRange(Range value);

    Range getEURange();

    PropertyType getEURangeNode();

    void setEURange(Range value);

    EUInformation getEngineeringUnits();

    PropertyType getEngineeringUnitsNode();

    void setEngineeringUnits(EUInformation value);

}
