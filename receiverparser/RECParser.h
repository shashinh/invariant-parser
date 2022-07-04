
// Generated from REC.g4 by ANTLR 4.9.2

#pragma once


#include "antlr4-runtime.h"


namespace REC {


class  RECParser : public antlr4::Parser {
public:
  enum {
    T__0 = 1, T__1 = 2, NUMS = 3, NEWLINE = 4
  };

  enum {
    RuleRecs = 0, RuleEntry = 1, RuleClasses = 2, RuleBciKey = 3
  };

  explicit RECParser(antlr4::TokenStream *input);
  ~RECParser();

  virtual std::string getGrammarFileName() const override;
  virtual const antlr4::atn::ATN& getATN() const override { return _atn; };
  virtual const std::vector<std::string>& getTokenNames() const override { return _tokenNames; }; // deprecated: use vocabulary instead.
  virtual const std::vector<std::string>& getRuleNames() const override;
  virtual antlr4::dfa::Vocabulary& getVocabulary() const override;


  class RecsContext;
  class EntryContext;
  class ClassesContext;
  class BciKeyContext; 

  class  RecsContext : public antlr4::ParserRuleContext {
  public:
    RecsContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *NEWLINE();
    antlr4::tree::TerminalNode *EOF();
    std::vector<EntryContext *> entry();
    EntryContext* entry(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  RecsContext* recs();

  class  EntryContext : public antlr4::ParserRuleContext {
  public:
    EntryContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    BciKeyContext *bciKey();
    ClassesContext *classes();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  EntryContext* entry();

  class  ClassesContext : public antlr4::ParserRuleContext {
  public:
    ClassesContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<antlr4::tree::TerminalNode *> NUMS();
    antlr4::tree::TerminalNode* NUMS(size_t i);


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ClassesContext* classes();

  class  BciKeyContext : public antlr4::ParserRuleContext {
  public:
    BciKeyContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *NUMS();


    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BciKeyContext* bciKey();


private:
  static std::vector<antlr4::dfa::DFA> _decisionToDFA;
  static antlr4::atn::PredictionContextCache _sharedContextCache;
  static std::vector<std::string> _ruleNames;
  static std::vector<std::string> _tokenNames;

  static std::vector<std::string> _literalNames;
  static std::vector<std::string> _symbolicNames;
  static antlr4::dfa::Vocabulary _vocabulary;
  static antlr4::atn::ATN _atn;
  static std::vector<uint16_t> _serializedATN;


  struct Initializer {
    Initializer();
  };
  static Initializer _init;
};

}  // namespace REC
