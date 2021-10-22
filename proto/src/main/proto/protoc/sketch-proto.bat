@REM *******************************
@REM This bat-file compiles .proto
@REM files to .java files
@REM *******************************
@echo off

set SRC_DIR=E:\gitrepo\protocol-rest\proto\src\main\proto
set DST_DIR=E:\gitrepo\protocol-rest\proto\src-gen-proto

:: Compile each .proto file in the source directory
for /R %SRC_DIR% %%i in (*.proto) do (
  protoc --proto_path=%SRC_DIR% --java_out=%DST_DIR% %%i
)