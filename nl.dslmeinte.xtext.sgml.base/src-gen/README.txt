This file is just here to ensure that the src-gen/ folder can be checking in into Git
but all its actual contents is ignored. This avoids confusion and irritation since the
project declares src-gen/ as a source folder and the project doesn't build as long as
the folder doesn't actually exist. This means the GenerateBase.mwe2 workflow cannot be
run right after cloning, without first creating src-gen/ (as a regular folder, not as
a source folder).

    -- Meinte Boersma, 7/8/2011

