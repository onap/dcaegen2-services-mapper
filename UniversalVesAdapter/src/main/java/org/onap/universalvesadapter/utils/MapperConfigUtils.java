/*
* ============LICENSE_START=======================================================
* ONAP : DCAE
* ================================================================================
* Copyright 2018 TechMahindra
*=================================================================================
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
* ============LICENSE_END=========================================================
*/
package org.onap.universalvesadapter.utils;

import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

import org.onap.universalvesadapter.exception.MapperConfigException;
import org.onap.universalvesadapter.mappingconfig.Entry;
import org.onap.universalvesadapter.mappingconfig.Evaluation;
import org.onap.universalvesadapter.mappingconfig.MapperConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * This class will be used in Future for different telemetry data:
 * This class will be utility class to read the mapper config file and parse the
 * config to prepare the grammar to detect the incoming json's event type.
 * 
 * @author kmalbari
 *
 */
public class MapperConfigUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(MapperConfigUtils.class);
    private static Set<Entry> entries = new TreeSet<>((o1, o2) -> o1.getPriority().compareTo(o2.getPriority()));

    private enum JoinOperator {
        AND("AND"), OR("OR");

        private final String value;

        private JoinOperator(final String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    private enum ExpressionOperator {
        EQUALS("EQUALS"), STARTSWITH("STARTSWITH"), ENDSWITH("ENDSWITH"), CONTAINS("CONTAINS");

        private final String value;

        private ExpressionOperator(final String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    private enum DataType {
        STRING("STRING"), DOUBLE("DOUBLE");

        private final String value;

        private DataType(final String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * main method.
     * 
     * @param args
     *            arguments
     */
    public static void main(String[] args) {

        String mappingFile = " { " + " \"entries\": [{ " + "     \"priority\": 4, " + "     \"evaluation\": { "
                + "         \"operand\": \"AND\", " + "         \"field\": null, " + "         \"value\": null, "
                + "         \"datatype\": null, " + "         \"lhs\": { " + "             \"operand\": \"OR\", "
                + "             \"field\": null, " + "             \"value\": null, "
                + "             \"datatype\": null, " + "             \"lhs\": { "
                + "                 \"operand\": \"EQUALS\", " + "                 \"field\": \"domain\", "
                + "                 \"value\": \"snmp-heartbeat\", " + "                 \"datatype\": \"string\", "
                + "                 \"lhs\": null, " + "                 \"rhs\": null " + "             }, "
                + "             \"rhs\": { " + "                 \"operand\": \"EQUALS\", "
                + "                 \"field\": \"domain\", " + "                 \"value\": \"snmp-fault\", "
                + "                 \"datatype\": \"string\", " + "                 \"lhs\": null, "
                + "                 \"rhs\": null " + "             } " + "         }, " + "         \"rhs\": { "
                + "             \"operand\": \"EQUALS\", " + "             \"field\": \"trap version\", "
                + "             \"value\": \"1.2\", " + "             \"datatype\": \"float\", "
                + "             \"lhs\": null, " + "             \"rhs\": null " + "         } " + "     }, "
                + "     \"result\": \"smooks.config\" " + " }, { " + "     \"priority\": 1, "
                + "     \"evaluation\": { " + "         \"operand\": \"AND\", " + "         \"field\": null, "
                + "         \"value\": null, " + "         \"datatype\": null, " + "         \"lhs\": { "
                + "             \"operand\": \"OR\", " + "             \"field\": null, "
                + "             \"value\": null, " + "             \"datatype\": null, " + "             \"lhs\": { "
                + "                 \"operand\": \"EQUALS\", " + "                 \"field\": \"domain\", "
                + "                 \"value\": \"snmp-heartbeat\", " + "                 \"datatype\": \"string\", "
                + "                 \"lhs\": null, " + "                 \"rhs\": null " + "             }, "
                + "             \"rhs\": { " + "                 \"operand\": \"EQUALS\", "
                + "                 \"field\": \"domain\", " + "                 \"value\": \"snmp-fault\", "
                + "                 \"datatype\": \"string\", " + "                 \"lhs\": null, "
                + "                 \"rhs\": null " + "             } " + "         }, " + "         \"rhs\": { "
                + "             \"operand\": \"EQUALS\", " + "             \"field\": \"trap version\", "
                + "             \"value\": \"1.2\", " + "             \"datatype\": \"float\", "
                + "             \"lhs\": null, " + "             \"rhs\": null " + "         } " + "     }, "
                + "     \"result\": \"smooks.config\" " + " }, { " + "     \"priority\": 3, "
                + "     \"evaluation\": { " + "         \"operand\": \"AND\", " + "         \"field\": null, "
                + "         \"value\": null, " + "         \"datatype\": null, " + "         \"lhs\": { "
                + "             \"operand\": \"OR\", " + "             \"field\": null, "
                + "             \"value\": null, " + "             \"datatype\": null, " + "             \"lhs\": { "
                + "                 \"operand\": \"EQUALS\", " + "                 \"field\": \"domain\", "
                + "                 \"value\": \"snmp-heartbeat\", " + "                 \"datatype\": \"string\", "
                + "                 \"lhs\": null, " + "                 \"rhs\": null " + "             }, "
                + "             \"rhs\": { " + "                 \"operand\": \"EQUALS\", "
                + "                 \"field\": \"domain\", " + "                 \"value\": \"snmp-fault\", "
                + "                 \"datatype\": \"string\", " + "                 \"lhs\": null, "
                + "                 \"rhs\": null " + "             } " + "         }, " + "         \"rhs\": { "
                + "             \"operand\": \"EQUALS\", " + "             \"field\": \"trap version\", "
                + "             \"value\": \"1.2\", " + "             \"datatype\": \"float\", "
                + "             \"lhs\": null, " + "             \"rhs\": null " + "         } " + "     }, "
                + "     \"result\": \"smooks.config\" " + " }, { " + "     \"priority\": 2, "
                + "     \"evaluation\": { " + "         \"operand\": \"AND\", " + "         \"field\": null, "
                + "         \"value\": null, " + "         \"datatype\": null, " + "         \"lhs\": { "
                + "             \"operand\": \"OR\", " + "             \"field\": null, "
                + "             \"value\": null, " + "             \"datatype\": null, " + "             \"lhs\": { "
                + "                 \"operand\": \"EQUALS\", " + "                 \"field\": \"domain\", "
                + "                 \"value\": \"snmp-heartbeat\", " + "                 \"datatype\": \"string\", "
                + "                 \"lhs\": null, " + "                 \"rhs\": null " + "             }, "
                + "             \"rhs\": { " + "                 \"operand\": \"EQUALS\", "
                + "                 \"field\": \"domain\", " + "                 \"value\": \"snmp-fault\", "
                + "                 \"datatype\": \"string\", " + "                 \"lhs\": null, "
                + "                 \"rhs\": null " + "             } " + "         }, " + "         \"rhs\": { "
                + "             \"operand\": \"EQUALS\", " + "             \"field\": \"trap version\", "
                + "             \"value\": \"1.2\", " + "             \"datatype\": \"float\", "
                + "             \"lhs\": null, " + "             \"rhs\": null " + "         } " + "     }, "
                + "     \"result\": \"smooks.config\" " + " }] " + "}";
        String incomingJsonString = "{\"domain\":\"snmp-heartbeat\",\"trap version\":1.2}";

        try {
            readMapperConfigFile(mappingFile);
            checkIncomingJsonForMatchingDomain(incomingJsonString);
        } catch (MapperConfigException e) {
            LOGGER.error("Exception in mapperConfigFile reading:{}",e);
        }

    }

    /**
     * Checks incoming json to see which of the domain it mathces as per mapper
     * config entries. If nothing matches, a default mapping will be used.
     * 
     * @param incomingJsonString
     *            incoming json
     * @throws MapperConfigException
     *             if error occurs in operation
     */
    public static String checkIncomingJsonForMatchingDomain(String incomingJsonString) throws MapperConfigException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode actualObj = null;
        try {
            actualObj = mapper.readTree(incomingJsonString);
        } catch (IOException exception) {
            throw new MapperConfigException("Unable to read incoming json in a tree " + exception.getMessage(),
                    exception);
        }
        for (Entry entry : entries) {

            boolean result = false;
            result = evaluateEntryMatch(entry.getEvaluation(), actualObj);
            if (result) {
                return entry.getResult();
            }
        }
        return "default";
    }

    /**
     * Reads the mapper config file.
     * 
     * @param mappingFileData
     *            string json for mapper config
     * @throws MapperConfigException
     *             if error in mapper config
     */
    public static void readMapperConfigFile(String mappingFileData) throws MapperConfigException {

        ObjectMapper name = new ObjectMapper();
        MapperConfig config = null;
        try {
            config = name.readValue(mappingFileData, MapperConfig.class);
        } catch (IOException exception) {
            throw new MapperConfigException("Unable to read config file for reason...\n " + exception.getMessage(),
                    exception);
        }
        LOGGER.debug("Read config file content into :{}",config);
        
        if (null != config) {
            entries.addAll(config.getEntries());
        } else {
            throw new MapperConfigException("Unable to generate configuration for different domains.");
        }
    }

    /**
     * Evaluates the passed in {@code Evaluation} instance and return boolean
     * result.
     * 
     * @param evaluation
     *            evaluation instance
     * @param actualObj
     *            Json node with values to compare with
     * @return true if matches evaluation else false
     * @throws MapperConfigException
     *             error in evaluation
     */
    public static boolean evaluateEntryMatch(Evaluation evaluation, JsonNode actualObj) throws MapperConfigException {
        if (null == evaluation) {
            throw new MapperConfigException("Cannot have null evaluation");
        }
        if (null != evaluation.getOperand()) {

            if (MapperConfigUtils.isValidEnum(JoinOperator.class, evaluation.getOperand())) {
                // if(JOIN_OPERATOR.contains(evaluation.getOperand())){
                switch (JoinOperator.valueOf(evaluation.getOperand())) {
                    case AND:
                        return evaluateEntryMatch(evaluation.getLhs(), actualObj)
                                && evaluateEntryMatch(evaluation.getRhs(), actualObj);
                    case OR:
                        return evaluateEntryMatch(evaluation.getLhs(), actualObj)
                                || evaluateEntryMatch(evaluation.getRhs(), actualObj);
                    default:
                        break;
                }
            }

            if (MapperConfigUtils.isValidEnum(ExpressionOperator.class, evaluation.getOperand())) {
                // if(EXPR_OPERATOR.contains(evaluation.getOperand())){

                // currently it is assumed field being compared is first level
                // child of incoming JSON structure.
                // If needed, can write a JsonPath implementation later
                String field = evaluation.getField();
                if (null != field && null != evaluation.getDatatype() && actualObj.has(field)) {
                    switch (ExpressionOperator.valueOf(evaluation.getOperand())) {
                        case EQUALS:
                            if (MapperConfigUtils.isValidEnum(DataType.class, evaluation.getDatatype())) {
                                switch (DataType.valueOf(evaluation.getDatatype())) {
                                    case STRING:
                                        if (null != actualObj.get(field))
                                            return actualObj.get(field).asText().equals(evaluation.getValue());
                                        break;
                                    case DOUBLE:
                                        if (null != actualObj.get(field))
                                            return actualObj.get(field).asDouble() == Double
                                                    .valueOf(evaluation.getValue());
                                        break;
                                    default:
                                        return false;
                                }
                            } else
                                return false;
                            break;
                        case STARTSWITH:
                            if (MapperConfigUtils.isValidEnum(DataType.class, evaluation.getDatatype())) {
                                switch (DataType.valueOf(evaluation.getDatatype())) {
                                    case STRING:
                                        if (null != actualObj.get(field))
                                            return actualObj.get(field).asText().startsWith(evaluation.getValue());
                                        break;
                                    default:
                                        return false;
                                }
                            } else
                                return false;
                            break;
                        case ENDSWITH:
                            if (MapperConfigUtils.isValidEnum(DataType.class, evaluation.getDatatype())) {
                                switch (DataType.valueOf(evaluation.getDatatype())) {
                                    case STRING:
                                        if (null != actualObj.get(field))
                                            return actualObj.get(field).asText().endsWith(evaluation.getValue());
                                        break;
                                    default:
                                        return false;
                                }
                            } else
                                return false;
                            break;
                        case CONTAINS:
                            if (MapperConfigUtils.isValidEnum(DataType.class, evaluation.getDatatype())) {
                                switch (DataType.valueOf(evaluation.getDatatype())) {
                                    case STRING:
                                        if (null != actualObj.get(field))
                                            return actualObj.get(field).asText().contains(evaluation.getValue());
                                        break;
                                    default:
                                        return false;
                                }
                            } else
                                return false;
                            break;
                        default:
                            return false;
                    }
                }
            }
        } else
            throw new MapperConfigException("Not an expected operand as per config for " + evaluation.getField());

        return false;
    }
    /**
     * <p>Checks if the specified name is a valid enum for the class.</p>
     *
     * <p>This method differs from {@link Enum#valueOf} in that checks if the name is
     * a valid enum without needing to catch the exception.</p>
     *
     * @param <E> the type of the enumeration
     * @param enumClass  the class of the enum to query, not null
     * @param enumName   the enum name, null returns false
     * @return true if the enum name is valid, otherwise false
     */

    public static <E extends Enum<E>> boolean isValidEnum(final Class<E> enumClass, final String enumName) {
        if (enumName == null) {
            return false;
        }
        try {
            Enum.valueOf(enumClass, enumName);
            return true;
        } catch (final IllegalArgumentException ex) {
            return false;
        }
    }


}
