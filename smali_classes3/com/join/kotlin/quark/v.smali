.class public final synthetic Lcom/join/kotlin/quark/v;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/chad/library/adapter/base/BaseQuickAdapter$d;


# instance fields
.field public final synthetic a:Lcom/join/kotlin/quark/adapter/SourceShareAdapter;

.field public final synthetic b:Lcom/join/kotlin/quark/SourceShareFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/join/kotlin/quark/adapter/SourceShareAdapter;Lcom/join/kotlin/quark/SourceShareFragment;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/kotlin/quark/v;->a:Lcom/join/kotlin/quark/adapter/SourceShareAdapter;

    iput-object p2, p0, Lcom/join/kotlin/quark/v;->b:Lcom/join/kotlin/quark/SourceShareFragment;

    return-void
.end method


# virtual methods
.method public final a(Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 2

    iget-object v0, p0, Lcom/join/kotlin/quark/v;->a:Lcom/join/kotlin/quark/adapter/SourceShareAdapter;

    iget-object v1, p0, Lcom/join/kotlin/quark/v;->b:Lcom/join/kotlin/quark/SourceShareFragment;

    invoke-static {v0, v1, p1, p2, p3}, Lcom/join/kotlin/quark/SourceShareFragment;->X(Lcom/join/kotlin/quark/adapter/SourceShareAdapter;Lcom/join/kotlin/quark/SourceShareFragment;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method
