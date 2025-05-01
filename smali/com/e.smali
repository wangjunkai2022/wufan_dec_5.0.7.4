.class public final synthetic Lcom/e;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/papa91/arc/CContext$IActivityLifeCycleListener;


# instance fields
.field public final synthetic a:Lcom/MApplication;


# direct methods
.method public synthetic constructor <init>(Lcom/MApplication;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/e;->a:Lcom/MApplication;

    return-void
.end method


# virtual methods
.method public final onCreated()V
    .locals 1

    iget-object v0, p0, Lcom/e;->a:Lcom/MApplication;

    invoke-static {v0}, Lcom/MApplication;->b(Lcom/MApplication;)V

    return-void
.end method
