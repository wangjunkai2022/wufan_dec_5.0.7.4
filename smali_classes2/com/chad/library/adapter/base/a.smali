.class public final synthetic Lcom/chad/library/adapter/base/a;
.super Ljava/lang/Object;

# interfaces
.implements Landroidx/recyclerview/widget/AsyncListDiffer$ListListener;


# instance fields
.field public final synthetic a:Lcom/chad/library/adapter/base/BaseDifferAdapter;


# direct methods
.method public synthetic constructor <init>(Lcom/chad/library/adapter/base/BaseDifferAdapter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/chad/library/adapter/base/a;->a:Lcom/chad/library/adapter/base/BaseDifferAdapter;

    return-void
.end method


# virtual methods
.method public final onCurrentListChanged(Ljava/util/List;Ljava/util/List;)V
    .locals 1

    iget-object v0, p0, Lcom/chad/library/adapter/base/a;->a:Lcom/chad/library/adapter/base/BaseDifferAdapter;

    invoke-static {v0, p1, p2}, Lcom/chad/library/adapter/base/BaseDifferAdapter;->e(Lcom/chad/library/adapter/base/BaseDifferAdapter;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method
