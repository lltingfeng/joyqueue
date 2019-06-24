/**
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
 */
package com.jd.journalq.broker.kafka.command;

import com.jd.journalq.broker.kafka.KafkaCommandType;
import com.jd.journalq.broker.kafka.model.PartitionMetadataAndError;

import java.util.List;
import java.util.Map;

/**
 * TxnOffsetCommitRequest
 * author: gaohaoxiang
 * email: gaohaoxiang@jd.com
 * date: 2019/4/4
 */
public class TxnOffsetCommitResponse extends KafkaRequestOrResponse {

    private Map<String, List<PartitionMetadataAndError>> partitions;

    public TxnOffsetCommitResponse() {

    }

    public TxnOffsetCommitResponse(Map<String, List<PartitionMetadataAndError>> partitions) {
        this.partitions = partitions;
    }

    public Map<String, List<PartitionMetadataAndError>> getPartitions() {
        return partitions;
    }

    public void setPartitions(Map<String, List<PartitionMetadataAndError>> partitions) {
        this.partitions = partitions;
    }

    @Override
    public int type() {
        return KafkaCommandType.TXN_OFFSET_COMMIT.getCode();
    }
}
