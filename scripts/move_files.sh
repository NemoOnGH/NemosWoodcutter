#!/bin/bash

ID="$1"

move_files() {
  local id="$1"
  local src="../common/src/generated/resources/data/nemos_woodcutter"
  local dest="../common/src/main/resources/resourcepacks/${id}/data/nemos_woodcutter"

 grep -rl "$id" "$src" | while read -r FILE; do
    REL_PATH="${FILE#$src/}" # preserve subfolder structure
    DEST_PATH="$dest/$(dirname "$REL_PATH")"
    mkdir -p "$DEST_PATH"

    echo "Moving: $FILE -> $DEST_PATH/"
    mv "$FILE" "$DEST_PATH/"
  done
}

move_files "biomesoplenty"
move_files "nemos_mossy_blocks"
