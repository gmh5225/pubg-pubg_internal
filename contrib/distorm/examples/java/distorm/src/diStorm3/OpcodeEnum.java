package diStorm3;

public enum OpcodeEnum {
	UNDEFINED, ADD, PUSH, POP, OR, ADC, SBB, AND, DAA, SUB, DAS, XOR, AAA, CMP,
	AAS, INC, DEC, PUSHA, POPA, BOUND, ARPL, IMUL, INS, OUTS, JO, JNO, JB, JAE,
	JZ, JNZ, JBE, JA, JS, JNS, JP, JNP, JL, JGE, JLE, JG, TEST, XCHG, MOV, LEA,
	CBW, CWDE, CDQE, CWD, CDQ, CQO, CALL_FAR, PUSHF, POPF, SAHF, LAHF, MOVS, CMPS,
	STOS, LODS, SCAS, RET, LES, LDS, ENTER, LEAVE, RETF, INT_3, INT, INTO, IRET,
	AAM, AAD, SALC, XLAT, LOOPNZ, LOOPZ, LOOP, JCXZ, JECXZ, JRCXZ, IN, OUT, CALL,
	JMP, JMP_FAR, INT1, HLT, CMC, CLC, STC, CLI, STI, CLD, STD, LAR, LSL, SYSCALL,
	CLTS, SYSRET, INVD, WBINVD, UD2, FEMMS, NOP, WRMSR, RDTSC, RDMSR, RDPMC, SYSENTER,
	SYSEXIT, GETSEC, CMOVO, CMOVNO, CMOVB, CMOVAE, CMOVZ, CMOVNZ, CMOVBE, CMOVA,
	CMOVS, CMOVNS, CMOVP, CMOVNP, CMOVL, CMOVGE, CMOVLE, CMOVG, SETO, SETNO, SETB,
	SETAE, SETZ, SETNZ, SETBE, SETA, SETS, SETNS, SETP, SETNP, SETL, SETGE, SETLE,
	SETG, CPUID, BT, SHLD, RSM, BTS, SHRD, CMPXCHG, LSS, BTR, LFS, LGS, MOVZX,
	BTC, MOVSX, XADD, MOVNTI, BSWAP, ROL, ROR, RCL, RCR, SHL, SHR, SAL, SAR, XABORT,
	XBEGIN, FADD, FMUL, FCOM, FCOMP, FSUB, FSUBR, FDIV, FDIVR, FLD, FST, FSTP,
	FLDENV, FLDCW, FXCH, FNOP, FCHS, FABS, FTST, FXAM, FLD1, FLDL2T, FLDL2E, FLDPI,
	FLDLG2, FLDLN2, FLDZ, F2XM1, FYL2X, FPTAN, FPATAN, FXTRACT, FPREM1, FDECSTP,
	FINCSTP, FPREM, FYL2XP1, FSQRT, FSINCOS, FRNDINT, FSCALE, FSIN, FCOS, FIADD,
	FIMUL, FICOM, FICOMP, FISUB, FISUBR, FIDIV, FIDIVR, FCMOVB, FCMOVE, FCMOVBE,
	FCMOVU, FUCOMPP, FILD, FISTTP, FIST, FISTP, FCMOVNB, FCMOVNE, FCMOVNBE, FCMOVNU,
	FENI, FEDISI, FSETPM, FUCOMI, FCOMI, FRSTOR, FFREE, FUCOM, FUCOMP, FADDP,
	FMULP, FCOMPP, FSUBRP, FSUBP, FDIVRP, FDIVP, FBLD, FBSTP, FUCOMIP, FCOMIP,
	NOT, NEG, MUL, DIV, IDIV, SLDT, STR, LLDT, LTR, VERR, VERW, SGDT, SIDT, LGDT,
	LIDT, SMSW, LMSW, INVLPG, VMCALL, VMLAUNCH, VMRESUME, VMXOFF, MONITOR, MWAIT,
	XGETBV, XSETBV, VMFUNC, XEND, VMRUN, VMMCALL, VMLOAD, VMSAVE, STGI, CLGI,
	SKINIT, INVLPGA, SWAPGS, RDTSCP, PREFETCH, PREFETCHW, PI2FW, PI2FD, PF2IW,
	PF2ID, PFNACC, PFPNACC, PFCMPGE, PFMIN, PFRCP, PFRSQRT, PFSUB, PFADD, PFCMPGT,
	PFMAX, PFRCPIT1, PFRSQIT1, PFSUBR, PFACC, PFCMPEQ, PFMUL, PFRCPIT2, PMULHRW,
	PSWAPD, PAVGUSB, MOVUPS, MOVUPD, MOVSS, MOVSD, VMOVUPS, VMOVUPD, VMOVSS, VMOVSD,
	MOVHLPS, MOVLPS, MOVLPD, MOVSLDUP, MOVDDUP, VMOVHLPS, VMOVLPS, VMOVLPD, VMOVSLDUP,
	VMOVDDUP, UNPCKLPS, UNPCKLPD, VUNPCKLPS, VUNPCKLPD, UNPCKHPS, UNPCKHPD, VUNPCKHPS,
	VUNPCKHPD, MOVLHPS, MOVHPS, MOVHPD, MOVSHDUP, VMOVLHPS, VMOVHPS, VMOVHPD,
	VMOVSHDUP, PREFETCHNTA, PREFETCHT0, PREFETCHT1, PREFETCHT2, MOVAPS, MOVAPD,
	VMOVAPS, VMOVAPD, CVTPI2PS, CVTPI2PD, CVTSI2SS, CVTSI2SD, VCVTSI2SS, VCVTSI2SD,
	MOVNTPS, MOVNTPD, MOVNTSS, MOVNTSD, VMOVNTPS, VMOVNTPD, CVTTPS2PI, CVTTPD2PI,
	CVTTSS2SI, CVTTSD2SI, VCVTTSS2SI, VCVTTSD2SI, CVTPS2PI, CVTPD2PI, CVTSS2SI,
	CVTSD2SI, VCVTSS2SI, VCVTSD2SI, UCOMISS, UCOMISD, VUCOMISS, VUCOMISD, COMISS,
	COMISD, VCOMISS, VCOMISD, MOVMSKPS, MOVMSKPD, VMOVMSKPS, VMOVMSKPD, SQRTPS,
	SQRTPD, SQRTSS, SQRTSD, VSQRTPS, VSQRTPD, VSQRTSS, VSQRTSD, RSQRTPS, RSQRTSS,
	VRSQRTPS, VRSQRTSS, RCPPS, RCPSS, VRCPPS, VRCPSS, ANDPS, ANDPD, VANDPS, VANDPD,
	ANDNPS, ANDNPD, VANDNPS, VANDNPD, ORPS, ORPD, VORPS, VORPD, XORPS, XORPD,
	VXORPS, VXORPD, ADDPS, ADDPD, ADDSS, ADDSD, VADDPS, VADDPD, VADDSS, VADDSD,
	MULPS, MULPD, MULSS, MULSD, VMULPS, VMULPD, VMULSS, VMULSD, CVTPS2PD, CVTPD2PS,
	CVTSS2SD, CVTSD2SS, VCVTPS2PD, VCVTPD2PS, VCVTSS2SD, VCVTSD2SS, CVTDQ2PS,
	CVTPS2DQ, CVTTPS2DQ, VCVTDQ2PS, VCVTPS2DQ, VCVTTPS2DQ, SUBPS, SUBPD, SUBSS,
	SUBSD, VSUBPS, VSUBPD, VSUBSS, VSUBSD, MINPS, MINPD, MINSS, MINSD, VMINPS,
	VMINPD, VMINSS, VMINSD, DIVPS, DIVPD, DIVSS, DIVSD, VDIVPS, VDIVPD, VDIVSS,
	VDIVSD, MAXPS, MAXPD, MAXSS, MAXSD, VMAXPS, VMAXPD, VMAXSS, VMAXSD, PUNPCKLBW,
	VPUNPCKLBW, PUNPCKLWD, VPUNPCKLWD, PUNPCKLDQ, VPUNPCKLDQ, PACKSSWB, VPACKSSWB,
	PCMPGTB, VPCMPGTB, PCMPGTW, VPCMPGTW, PCMPGTD, VPCMPGTD, PACKUSWB, VPACKUSWB,
	PUNPCKHBW, VPUNPCKHBW, PUNPCKHWD, VPUNPCKHWD, PUNPCKHDQ, VPUNPCKHDQ, PACKSSDW,
	VPACKSSDW, PUNPCKLQDQ, VPUNPCKLQDQ, PUNPCKHQDQ, VPUNPCKHQDQ, MOVD, MOVQ, VMOVD,
	VMOVQ, MOVDQA, MOVDQU, VMOVDQA, VMOVDQU, PSHUFW, PSHUFD, PSHUFHW, PSHUFLW,
	VPSHUFD, VPSHUFHW, VPSHUFLW, PCMPEQB, VPCMPEQB, PCMPEQW, VPCMPEQW, PCMPEQD,
	VPCMPEQD, EMMS, VZEROUPPER, VZEROALL, VMREAD, EXTRQ, INSERTQ, VMWRITE, CVTPH2PS,
	CVTPS2PH, HADDPD, HADDPS, VHADDPD, VHADDPS, HSUBPD, HSUBPS, VHSUBPD, VHSUBPS,
	XSAVE, XSAVE64, LFENCE, XRSTOR, XRSTOR64, MFENCE, XSAVEOPT, XSAVEOPT64, SFENCE,
	CLFLUSH, POPCNT, BSF, TZCNT, BSR, LZCNT, CMPEQPS, CMPLTPS, CMPLEPS, CMPUNORDPS,
	CMPNEQPS, CMPNLTPS, CMPNLEPS, CMPORDPS, CMPEQPD, CMPLTPD, CMPLEPD, CMPUNORDPD,
	CMPNEQPD, CMPNLTPD, CMPNLEPD, CMPORDPD, CMPEQSS, CMPLTSS, CMPLESS, CMPUNORDSS,
	CMPNEQSS, CMPNLTSS, CMPNLESS, CMPORDSS, CMPEQSD, CMPLTSD, CMPLESD, CMPUNORDSD,
	CMPNEQSD, CMPNLTSD, CMPNLESD, CMPORDSD, VCMPEQPS, VCMPLTPS, VCMPLEPS, VCMPUNORDPS,
	VCMPNEQPS, VCMPNLTPS, VCMPNLEPS, VCMPORDPS, VCMPEQ_UQPS, VCMPNGEPS, VCMPNGTPS,
	VCMPFALSEPS, VCMPNEQ_OQPS, VCMPGEPS, VCMPGTPS, VCMPTRUEPS, VCMPEQ_OSPS, VCMPLT_OQPS,
	VCMPLE_OQPS, VCMPUNORD_SPS, VCMPNEQ_USPS, VCMPNLT_UQPS, VCMPNLE_UQPS, VCMPORD_SPS,
	VCMPEQ_USPS, VCMPNGE_UQPS, VCMPNGT_UQPS, VCMPFALSE_OSPS, VCMPNEQ_OSPS, VCMPGE_OQPS,
	VCMPGT_OQPS, VCMPTRUE_USPS, VCMPEQPD, VCMPLTPD, VCMPLEPD, VCMPUNORDPD, VCMPNEQPD,
	VCMPNLTPD, VCMPNLEPD, VCMPORDPD, VCMPEQ_UQPD, VCMPNGEPD, VCMPNGTPD, VCMPFALSEPD,
	VCMPNEQ_OQPD, VCMPGEPD, VCMPGTPD, VCMPTRUEPD, VCMPEQ_OSPD, VCMPLT_OQPD, VCMPLE_OQPD,
	VCMPUNORD_SPD, VCMPNEQ_USPD, VCMPNLT_UQPD, VCMPNLE_UQPD, VCMPORD_SPD, VCMPEQ_USPD,
	VCMPNGE_UQPD, VCMPNGT_UQPD, VCMPFALSE_OSPD, VCMPNEQ_OSPD, VCMPGE_OQPD, VCMPGT_OQPD,
	VCMPTRUE_USPD, VCMPEQSS, VCMPLTSS, VCMPLESS, VCMPUNORDSS, VCMPNEQSS, VCMPNLTSS,
	VCMPNLESS, VCMPORDSS, VCMPEQ_UQSS, VCMPNGESS, VCMPNGTSS, VCMPFALSESS, VCMPNEQ_OQSS,
	VCMPGESS, VCMPGTSS, VCMPTRUESS, VCMPEQ_OSSS, VCMPLT_OQSS, VCMPLE_OQSS, VCMPUNORD_SSS,
	VCMPNEQ_USSS, VCMPNLT_UQSS, VCMPNLE_UQSS, VCMPORD_SSS, VCMPEQ_USSS, VCMPNGE_UQSS,
	VCMPNGT_UQSS, VCMPFALSE_OSSS, VCMPNEQ_OSSS, VCMPGE_OQSS, VCMPGT_OQSS, VCMPTRUE_USSS,
	VCMPEQSD, VCMPLTSD, VCMPLESD, VCMPUNORDSD, VCMPNEQSD, VCMPNLTSD, VCMPNLESD,
	VCMPORDSD, VCMPEQ_UQSD, VCMPNGESD, VCMPNGTSD, VCMPFALSESD, VCMPNEQ_OQSD, VCMPGESD,
	VCMPGTSD, VCMPTRUESD, VCMPEQ_OSSD, VCMPLT_OQSD, VCMPLE_OQSD, VCMPUNORD_SSD,
	VCMPNEQ_USSD, VCMPNLT_UQSD, VCMPNLE_UQSD, VCMPORD_SSD, VCMPEQ_USSD, VCMPNGE_UQSD,
	VCMPNGT_UQSD, VCMPFALSE_OSSD, VCMPNEQ_OSSD, VCMPGE_OQSD, VCMPGT_OQSD, VCMPTRUE_USSD,
	PINSRW, VPINSRW, PEXTRW, VPEXTRW, SHUFPS, SHUFPD, VSHUFPS, VSHUFPD, CMPXCHG8B,
	CMPXCHG16B, VMPTRST, ADDSUBPD, ADDSUBPS, VADDSUBPD, VADDSUBPS, PSRLW, VPSRLW,
	PSRLD, VPSRLD, PSRLQ, VPSRLQ, PADDQ, VPADDQ, PMULLW, VPMULLW, MOVQ2DQ, MOVDQ2Q,
	PMOVMSKB, VPMOVMSKB, PSUBUSB, VPSUBUSB, PSUBUSW, VPSUBUSW, PMINUB, VPMINUB,
	PAND, VPAND, PADDUSB, VPADDUSW, PADDUSW, PMAXUB, VPMAXUB, PANDN, VPANDN, PAVGB,
	VPAVGB, PSRAW, VPSRAW, PSRAD, VPSRAD, PAVGW, VPAVGW, PMULHUW, VPMULHUW, PMULHW,
	VPMULHW, CVTTPD2DQ, CVTDQ2PD, CVTPD2DQ, VCVTTPD2DQ, VCVTDQ2PD, VCVTPD2DQ,
	MOVNTQ, MOVNTDQ, VMOVNTDQ, PSUBSB, VPSUBSB, PSUBSW, VPSUBSW, PMINSW, VPMINSW,
	POR, VPOR, PADDSB, VPADDSB, PADDSW, VPADDSW, PMAXSW, VPMAXSW, PXOR, VPXOR,
	LDDQU, VLDDQU, PSLLW, VPSLLW, PSLLD, VPSLLD, PSLLQ, VPSLLQ, PMULUDQ, VPMULUDQ,
	PMADDWD, VPMADDWD, PSADBW, VPSADBW, MASKMOVQ, MASKMOVDQU, VMASKMOVDQU, PSUBB,
	VPSUBB, PSUBW, VPSUBW, PSUBD, VPSUBD, PSUBQ, VPSUBQ, PADDB, VPADDB, PADDW,
	VPADDW, PADDD, VPADDD, FNSTENV, FSTENV, FNSTCW, FSTCW, FNCLEX, FCLEX, FNINIT,
	FINIT, FNSAVE, FSAVE, FNSTSW, FSTSW, PSHUFB, VPSHUFB, PHADDW, VPHADDW, PHADDD,
	VPHADDD, PHADDSW, VPHADDSW, PMADDUBSW, VPMADDUBSW, PHSUBW, VPHSUBW, PHSUBD,
	VPHSUBD, PHSUBSW, VPHSUBSW, PSIGNB, VPSIGNB, PSIGNW, VPSIGNW, PSIGND, VPSIGND,
	PMULHRSW, VPMULHRSW, VPERMILPS, VPERMILPD, VTESTPS, VTESTPD, PBLENDVB, BLENDVPS,
	BLENDVPD, PTEST, VPTEST, VBROADCASTSS, VBROADCASTSD, VBROADCASTF128, PABSB,
	VPABSB, PABSW, VPABSW, PABSD, VPABSD, PMOVSXBW, VPMOVSXBW, PMOVSXBD, VPMOVSXBD,
	PMOVSXBQ, VPMOVSXBQ, PMOVSXWD, VPMOVSXWD, PMOVSXWQ, VPMOVSXWQ, PMOVSXDQ, VPMOVSXDQ,
	PMULDQ, VPMULDQ, PCMPEQQ, VPCMPEQQ, MOVNTDQA, VMOVNTDQA, PACKUSDW, VPACKUSDW,
	VMASKMOVPS, VMASKMOVPD, PMOVZXBW, VPMOVZXBW, PMOVZXBD, VPMOVZXBD, PMOVZXBQ,
	VPMOVZXBQ, PMOVZXWD, VPMOVZXWD, PMOVZXWQ, VPMOVZXWQ, PMOVZXDQ, VPMOVZXDQ,
	PCMPGTQ, VPCMPGTQ, PMINSB, VPMINSB, PMINSD, VPMINSD, PMINUW, VPMINUW, PMINUD,
	VPMINUD, PMAXSB, VPMAXSB, PMAXSD, VPMAXSD, PMAXUW, VPMAXUW, PMAXUD, VPMAXUD,
	PMULLD, VPMULLD, PHMINPOSUW, VPHMINPOSUW, INVEPT, INVVPID, INVPCID, VFMADDSUB132PS,
	VFMADDSUB132PD, VFMSUBADD132PS, VFMSUBADD132PD, VFMADD132PS, VFMADD132PD,
	VFMADD132SS, VFMADD132SD, VFMSUB132PS, VFMSUB132PD, VFMSUB132SS, VFMSUB132SD,
	VFNMADD132PS, VFNMADD132PD, VFNMADD132SS, VFNMADD132SD, VFNMSUB132PS, VFNMSUB132PD,
	VFNMSUB132SS, VFNMSUB132SD, VFMADDSUB213PS, VFMADDSUB213PD, VFMSUBADD213PS,
	VFMSUBADD213PD, VFMADD213PS, VFMADD213PD, VFMADD213SS, VFMADD213SD, VFMSUB213PS,
	VFMSUB213PD, VFMSUB213SS, VFMSUB213SD, VFNMADD213PS, VFNMADD213PD, VFNMADD213SS,
	VFNMADD213SD, VFNMSUB213PS, VFNMSUB213PD, VFNMSUB213SS, VFNMSUB213SD, VFMADDSUB231PS,
	VFMADDSUB231PD, VFMSUBADD231PS, VFMSUBADD231PD, VFMADD231PS, VFMADD231PD,
	VFMADD231SS, VFMADD231SD, VFMSUB231PS, VFMSUB231PD, VFMSUB231SS, VFMSUB231SD,
	VFNMADD231PS, VFNMADD231PD, VFNMADD231SS, VFNMADD231SD, VFNMSUB231PS, VFNMSUB231PD,
	VFNMSUB231SS, VFNMSUB231SD, AESIMC, VAESIMC, AESENC, VAESENC, AESENCLAST,
	VAESENCLAST, AESDEC, VAESDEC, AESDECLAST, VAESDECLAST, MOVBE, CRC32, VPERM2F128,
	ROUNDPS, VROUNDPS, ROUNDPD, VROUNDPD, ROUNDSS, VROUNDSS, ROUNDSD, VROUNDSD,
	BLENDPS, VBLENDPS, BLENDPD, VBLENDPD, PBLENDW, VPBLENDW, PALIGNR, VPALIGNR,
	PEXTRB, VPEXTRB, PEXTRD, PEXTRQ, VPEXTRD, VPEXTRQ, EXTRACTPS, VEXTRACTPS,
	VINSERTF128, VEXTRACTF128, PINSRB, VPINSRB, INSERTPS, VINSERTPS, PINSRD, PINSRQ,
	VPINSRD, VPINSRQ, DPPS, VDPPS, DPPD, VDPPD, MPSADBW, VMPSADBW, PCLMULQDQ,
	VPCLMULQDQ, VBLENDVPS, VBLENDVPD, VPBLENDVB, PCMPESTRM, VPCMPESTRM, PCMPESTRI,
	VPCMPESTRI, PCMPISTRM, VPCMPISTRM, PCMPISTRI, VPCMPISTRI, AESKEYGENASSIST,
	VAESKEYGENASSIST, PSRLDQ, VPSRLDQ, PSLLDQ, VPSLLDQ, FXSAVE, FXSAVE64, RDFSBASE,
	FXRSTOR, FXRSTOR64, RDGSBASE, LDMXCSR, WRFSBASE, VLDMXCSR, STMXCSR, WRGSBASE,
	VSTMXCSR, VMPTRLD, VMCLEAR, VMXON, MOVSXD, PAUSE, WAIT, RDRAND, _3DNOW
}