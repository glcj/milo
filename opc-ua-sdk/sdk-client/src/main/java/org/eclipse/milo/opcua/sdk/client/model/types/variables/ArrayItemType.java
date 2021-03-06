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

package org.eclipse.milo.opcua.sdk.client.model.types.variables;

import java.util.concurrent.CompletableFuture;

import org.eclipse.milo.opcua.sdk.core.model.BasicProperty;
import org.eclipse.milo.opcua.sdk.core.model.Property;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.QualifiedName;
import org.eclipse.milo.opcua.stack.core.types.builtin.StatusCode;
import org.eclipse.milo.opcua.stack.core.types.enumerated.AxisScaleEnumeration;
import org.eclipse.milo.opcua.stack.core.types.structured.EUInformation;
import org.eclipse.milo.opcua.stack.core.types.structured.Range;


public interface ArrayItemType extends DataItemType {

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

    Property<LocalizedText> TITLE = new BasicProperty<>(
        QualifiedName.parse("0:Title"),
        NodeId.parse("ns=0;i=21"),
        -1,
        LocalizedText.class
    );

    Property<AxisScaleEnumeration> AXIS_SCALE_TYPE = new BasicProperty<>(
        QualifiedName.parse("0:AxisScaleType"),
        NodeId.parse("ns=0;i=12077"),
        -1,
        AxisScaleEnumeration.class
    );


    CompletableFuture<? extends PropertyType> instrumentRange();

    CompletableFuture<Range> getInstrumentRange();

    CompletableFuture<StatusCode> setInstrumentRange(Range value);

    CompletableFuture<? extends PropertyType> eURange();

    CompletableFuture<Range> getEURange();

    CompletableFuture<StatusCode> setEURange(Range value);

    CompletableFuture<? extends PropertyType> engineeringUnits();

    CompletableFuture<EUInformation> getEngineeringUnits();

    CompletableFuture<StatusCode> setEngineeringUnits(EUInformation value);

    CompletableFuture<? extends PropertyType> title();

    CompletableFuture<LocalizedText> getTitle();

    CompletableFuture<StatusCode> setTitle(LocalizedText value);

    CompletableFuture<? extends PropertyType> axisScaleType();

    CompletableFuture<AxisScaleEnumeration> getAxisScaleType();

    CompletableFuture<StatusCode> setAxisScaleType(AxisScaleEnumeration value);


}