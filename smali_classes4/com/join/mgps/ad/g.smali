.class public final synthetic Lcom/join/mgps/ad/g;
.super Ljava/lang/Object;

# interfaces
.implements Ls1/a;


# instance fields
.field public final synthetic a:Lcom/join/mgps/ad/h;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/ad/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/ad/g;->a:Lcom/join/mgps/ad/h;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lcom/join/mgps/ad/g;->a:Lcom/join/mgps/ad/h;

    invoke-virtual {v0}, Lcom/join/mgps/ad/d;->onInitSuccess()V

    return-void
.end method
