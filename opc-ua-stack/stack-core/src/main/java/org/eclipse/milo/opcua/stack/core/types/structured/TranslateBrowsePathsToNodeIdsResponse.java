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

package org.eclipse.milo.opcua.stack.core.types.structured;

import javax.annotation.Nullable;

import com.google.common.base.MoreObjects;
import org.eclipse.milo.opcua.stack.core.Identifiers;
import org.eclipse.milo.opcua.stack.core.serialization.DelegateRegistry;
import org.eclipse.milo.opcua.stack.core.serialization.UaDecoder;
import org.eclipse.milo.opcua.stack.core.serialization.UaEncoder;
import org.eclipse.milo.opcua.stack.core.serialization.UaResponseMessage;
import org.eclipse.milo.opcua.stack.core.types.UaDataType;
import org.eclipse.milo.opcua.stack.core.types.builtin.DiagnosticInfo;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;

@UaDataType("TranslateBrowsePathsToNodeIdsResponse")
public class TranslateBrowsePathsToNodeIdsResponse implements UaResponseMessage {

    public static final NodeId TypeId = Identifiers.TranslateBrowsePathsToNodeIdsResponse;
    public static final NodeId BinaryEncodingId = Identifiers.TranslateBrowsePathsToNodeIdsResponse_Encoding_DefaultBinary;
    public static final NodeId XmlEncodingId = Identifiers.TranslateBrowsePathsToNodeIdsResponse_Encoding_DefaultXml;

    protected final ResponseHeader _responseHeader;
    protected final BrowsePathResult[] _results;
    protected final DiagnosticInfo[] _diagnosticInfos;

    public TranslateBrowsePathsToNodeIdsResponse() {
        this._responseHeader = null;
        this._results = null;
        this._diagnosticInfos = null;
    }

    public TranslateBrowsePathsToNodeIdsResponse(ResponseHeader _responseHeader, BrowsePathResult[] _results, DiagnosticInfo[] _diagnosticInfos) {
        this._responseHeader = _responseHeader;
        this._results = _results;
        this._diagnosticInfos = _diagnosticInfos;
    }

    public ResponseHeader getResponseHeader() { return _responseHeader; }

    @Nullable
    public BrowsePathResult[] getResults() { return _results; }

    @Nullable
    public DiagnosticInfo[] getDiagnosticInfos() { return _diagnosticInfos; }

    @Override
    public NodeId getTypeId() { return TypeId; }

    @Override
    public NodeId getBinaryEncodingId() { return BinaryEncodingId; }

    @Override
    public NodeId getXmlEncodingId() { return XmlEncodingId; }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("ResponseHeader", _responseHeader)
            .add("Results", _results)
            .add("DiagnosticInfos", _diagnosticInfos)
            .toString();
    }

    public static void encode(TranslateBrowsePathsToNodeIdsResponse translateBrowsePathsToNodeIdsResponse, UaEncoder encoder) {
        encoder.encodeSerializable("ResponseHeader", translateBrowsePathsToNodeIdsResponse._responseHeader != null ? translateBrowsePathsToNodeIdsResponse._responseHeader : new ResponseHeader());
        encoder.encodeArray("Results", translateBrowsePathsToNodeIdsResponse._results, encoder::encodeSerializable);
        encoder.encodeArray("DiagnosticInfos", translateBrowsePathsToNodeIdsResponse._diagnosticInfos, encoder::encodeDiagnosticInfo);
    }

    public static TranslateBrowsePathsToNodeIdsResponse decode(UaDecoder decoder) {
        ResponseHeader _responseHeader = decoder.decodeSerializable("ResponseHeader", ResponseHeader.class);
        BrowsePathResult[] _results = decoder.decodeArray("Results", decoder::decodeSerializable, BrowsePathResult.class);
        DiagnosticInfo[] _diagnosticInfos = decoder.decodeArray("DiagnosticInfos", decoder::decodeDiagnosticInfo, DiagnosticInfo.class);

        return new TranslateBrowsePathsToNodeIdsResponse(_responseHeader, _results, _diagnosticInfos);
    }

    static {
        DelegateRegistry.registerEncoder(TranslateBrowsePathsToNodeIdsResponse::encode, TranslateBrowsePathsToNodeIdsResponse.class, BinaryEncodingId, XmlEncodingId);
        DelegateRegistry.registerDecoder(TranslateBrowsePathsToNodeIdsResponse::decode, TranslateBrowsePathsToNodeIdsResponse.class, BinaryEncodingId, XmlEncodingId);
    }

}
