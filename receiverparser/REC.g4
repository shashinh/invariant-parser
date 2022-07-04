grammar REC;

recs : (entry ';')* (NEWLINE | EOF);
entry : bciKey ' ' classes;
classes : NUMS ( ' ' (NUMS)* )?;
bciKey : NUMS;

NUMS : [0-9]+;
NEWLINE: [\r\n]+;
