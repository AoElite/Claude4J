package com.aoelite.claude.data;

import com.aoelite.claude.data.input.RoleInput;
import com.aoelite.claude.data.types.AIModel;
import lombok.*;
import org.jetbrains.annotations.Nullable;

import java.util.List;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Builder
public class ClaudeRequest {

    @NonNull private final AIModel model;
    @Builder.Default private final int max_tokens = 1000;
    @Nullable private String system;
    @Nullable @Singular private List<String> stop_sequences;
    @Builder.Default private double temperature = 0.0;
    @NonNull @Singular private final List<RoleInput> inputs;

}
