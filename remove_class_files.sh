#!/bin/bash

# Remove all .class files recursively from the current directory
find . -type f -name "*.class" -exec rm -f {} +
