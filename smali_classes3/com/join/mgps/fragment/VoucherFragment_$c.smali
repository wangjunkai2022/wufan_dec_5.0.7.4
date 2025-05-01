.class Lcom/join/mgps/fragment/VoucherFragment_$c;
.super Ljava/lang/Object;
.source "VoucherFragment_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/VoucherFragment_;->k0(Lcom/join/mgps/dto/PapayVoucherResultMain;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/PapayVoucherResultMain;

.field final synthetic c:Lcom/join/mgps/fragment/VoucherFragment_;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/VoucherFragment_;Lcom/join/mgps/dto/PapayVoucherResultMain;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/VoucherFragment_$c;->c:Lcom/join/mgps/fragment/VoucherFragment_;

    iput-object p2, p0, Lcom/join/mgps/fragment/VoucherFragment_$c;->b:Lcom/join/mgps/dto/PapayVoucherResultMain;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/VoucherFragment_$c;->c:Lcom/join/mgps/fragment/VoucherFragment_;

    iget-object v1, p0, Lcom/join/mgps/fragment/VoucherFragment_$c;->b:Lcom/join/mgps/dto/PapayVoucherResultMain;

    invoke-static {v0, v1}, Lcom/join/mgps/fragment/VoucherFragment_;->q0(Lcom/join/mgps/fragment/VoucherFragment_;Lcom/join/mgps/dto/PapayVoucherResultMain;)V

    return-void
.end method
