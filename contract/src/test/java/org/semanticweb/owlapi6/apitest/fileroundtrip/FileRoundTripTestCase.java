/* This file is part of the OWL API.
 * The contents of this file are subject to the LGPL License, Version 3.0.
 * Copyright 2014, The University of Manchester
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0 in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */
package org.semanticweb.owlapi6.apitest.fileroundtrip;

import java.util.Arrays;
import java.util.List;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author Matthew Horridge, The University Of Manchester, Information
 *         Management Group
 * @since 2.2.0
 */
@RunWith(Parameterized.class)
public class FileRoundTripTestCase extends AbstractFileRoundTrippingTestCase {

    public FileRoundTripTestCase(String f) {
        super(f);
    }

    @Parameters(name = "{0}")
    public static List<String> getData() {
        //@formatter:off
        return Arrays.asList(
            "AnnotatedPropertyAssertions.rdf", 
            "ComplexSubProperty.rdf", 
            "DataAllValuesFrom.rdf",
            "cardinalitywithwhitespace.owl", 
            "DataComplementOf.rdf", 
            "DataHasValue.rdf", 
            "DataIntersectionOf.rdf",
            "DataMaxCardinality.rdf", 
            "DataMinCardinality.rdf", 
            "DataOneOf.rdf", 
            "DataSomeValuesFrom.rdf",
            "DataUnionOf.rdf", 
            "DatatypeRestriction.rdf", 
            "TestDeclarations.rdf", 
            "Deprecated.rdf",
            "DisjointClasses.rdf", 
            "HasKey.rdf", 
            "InverseOf.rdf", 
            "ObjectAllValuesFrom.rdf", 
            "ObjectCardinality.rdf",
            "ObjectComplementOf.rdf", 
            "ObjectHasSelf.rdf", 
            "ObjectHasValue.rdf", 
            "ObjectIntersectionOf.rdf",
            "ObjectMaxCardinality.rdf", 
            "ObjectMaxQualifiedCardinality.rdf", 
            "ObjectMinCardinality.rdf",
            "ObjectMinQualifiedCardinality.rdf", 
            "ObjectOneOf.rdf", 
            "ObjectQualifiedCardinality.rdf",
            "ObjectSomeValuesFrom.rdf", 
            "ObjectUnionOf.rdf", 
            "primer.functionalsyntax.txt", 
            "primer.owlxml.xml",
            "primer.rdfxml.xml", 
            "RDFSClass.rdf", 
            "koala.owl", 
            "SubClassOf.rdf", 
            "TestParser06.rdf", 
            "TestParser07.rdf",
            "TestParser10.rdf", 
            "annotatedpropertychain.ttl.rdf", 
            "UntypedSubClassOf.rdf",
            "SubClassOfUntypedOWLClass.rdf", 
            "SubClassOfUntypedSomeValuesFrom.rdf");
        //@formatter:on
    }
}