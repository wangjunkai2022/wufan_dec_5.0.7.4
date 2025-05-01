.class public final synthetic Lcom/join/mgps/ad/w;
.super Ljava/lang/Object;

# interfaces
.implements Ls1/a;


# instance fields
.field public final synthetic a:Lcom/join/mgps/ad/x;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/ad/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/ad/w;->a:Lcom/join/mgps/ad/x;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lcom/join/mgps/ad/w;->a:Lcom/join/mgps/ad/x;

    invoke-virtual {v0}, Lcom/join/mgps/ad/d;->onInitSuccess()V

    return-void
.end method
