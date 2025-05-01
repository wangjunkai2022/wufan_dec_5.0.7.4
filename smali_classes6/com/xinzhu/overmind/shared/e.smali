.class public final synthetic Lcom/xinzhu/overmind/shared/e;
.super Ljava/lang/Object;

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic a:Lcom/xinzhu/overmind/shared/OMProxyActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/xinzhu/overmind/shared/OMProxyActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/xinzhu/overmind/shared/e;->a:Lcom/xinzhu/overmind/shared/OMProxyActivity;

    return-void
.end method


# virtual methods
.method public final onActivityResult(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/xinzhu/overmind/shared/e;->a:Lcom/xinzhu/overmind/shared/OMProxyActivity;

    check-cast p1, Landroidx/activity/result/ActivityResult;

    invoke-static {v0, p1}, Lcom/xinzhu/overmind/shared/OMProxyActivity;->g0(Lcom/xinzhu/overmind/shared/OMProxyActivity;Landroidx/activity/result/ActivityResult;)V

    return-void
.end method
